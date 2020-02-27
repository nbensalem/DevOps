import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApiCompaniesComponent } from './api-companies.component';

describe('ApiCompaniesComponent', () => {
  let component: ApiCompaniesComponent;
  let fixture: ComponentFixture<ApiCompaniesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApiCompaniesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApiCompaniesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
